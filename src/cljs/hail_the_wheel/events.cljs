(ns hail-the-wheel.events
  (:require
    [hail-the-wheel.db :as db]
    [re-frame.core :as re-frame]))


(defonce clicks (atom 0))


(re-frame/reg-event-db
  ::initialize-db
  (fn [_ _]
    db/default-db))


(def yes-no-strings ["YES" "NO"])


(re-frame/reg-event-fx
  :spin
  [(re-frame/inject-cofx :rotation)]
  (fn [cofx _]
    {:db (assoc (:db cofx) :rotation (:rotation cofx))}))


(def base-rotation 1800)


(re-frame/reg-cofx
  :rotation
  (fn [cofx _]
    (swap! clicks inc)
    (let [new-base-rotation (* @clicks base-rotation)
          deg (+ (+ 1 (int (* (rand) 360))) new-base-rotation)]
      (js/console.log deg)
      (assoc cofx :rotation deg))))
