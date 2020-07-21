(ns hail-the-wheel.events
  (:require
   [re-frame.core :as re-frame]
   [hail-the-wheel.db :as db]
   ))

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

(def min-value 1024)
(def max-value 9999)

(re-frame/reg-cofx
 :rotation
 (fn [cofx _]
   (let [deg (+ (int (* (rand) (- min-value max-value))) max-value)]
     (js/console.log deg)
     (assoc cofx :rotation deg))))
