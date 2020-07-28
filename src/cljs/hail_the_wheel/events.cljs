(ns hail-the-wheel.events
  (:require
    [hail-the-wheel.db :as db]
    [re-frame.core :as re-frame]))


(defonce clicks (atom 0))
(defonce timeouts (atom {}))


(re-frame/reg-event-db
  ::initialize-db
  (fn [_ _]
    db/default-db))


(def yes-no-strings ["YES" "NO"])


(re-frame/reg-event-fx
  :spin
  [(re-frame/inject-cofx :rotation)]
  (fn [cofx _]
    {:db (assoc (:db cofx) :rotation (:rotation cofx) :show-result (:show-result cofx))
     :timeout {:id :show-result-id
               :event [:show-result]
               :time 5900}}))

(re-frame/reg-fx
 :timeout
 (fn [{:keys [id event time]}]
   (when-some [existing (get @timeouts id)]
     (js/clearTimeout existing)
     (swap! timeouts dissoc id))
   (when (some? event)
     (swap! timeouts assoc id
     (js/setTimeout
      (fn []
        (re-frame/dispatch event))
      time)))))

(re-frame/reg-event-db
 :show-result
 (fn [db]
   (assoc db :show-result true)))

(def base-rotation 1800)

(re-frame/reg-cofx
  :rotation
  (fn [cofx _]
    (swap! clicks inc)
    (let [new-base-rotation (* @clicks base-rotation)
          deg (+ (+ 1 (int (* (rand) 360))) new-base-rotation)]
      (assoc cofx :rotation deg :show-result false))))
