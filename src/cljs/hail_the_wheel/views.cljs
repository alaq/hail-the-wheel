(ns hail-the-wheel.views
  (:require
   [re-frame.core :as re-frame]
   [hail-the-wheel.subs :as subs]
   ))

(def sayings ["Der wheel zur macht"
              "Wheel power"
              "Not a ferris wheel"
              "Boys wheel be boys"
              "Free wheel offering"
              "You spin me right round, baby"
              "Right round like a record, baby"
              "Time wheel tell"
              "I wheel survive"
              "We wheel rock you"
              "Wheel Wheaton"])

(defn the-wheel-says []
  (sayings (int (rand (count sayings)))))

(defn wheel []
  (let [yn (re-frame/subscribe [::subs/yn])]
    [:div
    (when @yn [:h3 "The wheel says " @yn])
    [:input {:type "button" :value "Spin"
             :on-click #(re-frame.core/dispatch [:spin])}]]))

(defn main-panel []
    [:div
        [:h1 "Hail the Wheel!"]
        [:h2 [the-wheel-says]]
        [wheel]])
