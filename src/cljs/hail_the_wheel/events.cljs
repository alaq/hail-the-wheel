(ns hail-the-wheel.events
  (:require
   [re-frame.core :as re-frame]
   [hail-the-wheel.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))

(def yes-no-string ["YES" "NO"])

(re-frame/reg-event-db
 :spin
 (fn [db]
   (let [spin-result (yes-no-string (int (rand 2)))]
   (js/console.log "Spin result:" spin-result)
   (assoc db :yn spin-result))))
