(ns hail-the-wheel.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::yn
 (fn [db]
   (:yn db)))
