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
  (let [rotation (re-frame/subscribe [::subs/rotation])]
    [:div
     [:div.wheel-box
      [:input.spin-button {:type "button" :value "Spin"
                           :on-click #(re-frame.core/dispatch [:spin])}]

      [:div.box {:style {:transform (str "rotate(" @rotation "deg)")}}
       [:div.box1
        [:span.span1 [:b "YES"]]
        [:span.span2 [:b "YES"]]
        [:span.span3 [:b "YES"]]
        [:span.span4 [:b "YES"]]]
       [:div.box2
        [:span.span1 [:b "NO"]]
        [:span.span2 [:b "NO"]]
        [:span.span3 [:b "NO"]]
        [:span.span4 [:b "NO"]]]]]
     (when (not= @rotation 0) [:h3 "The wheel says " @rotation])]))

(defn main-panel []
    [:div
        [:h1 "Hail the Wheel!"]
        [:h2 [the-wheel-says]]
        [wheel]])
