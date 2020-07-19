(ns hail-the-wheel.events
  (:require
   [re-frame.core :as re-frame]
   [hail-the-wheel.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
