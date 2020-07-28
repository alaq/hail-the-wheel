(ns hail-the-wheel.views
  (:require
    [hail-the-wheel.subs :as subs]
    [re-frame.core :as re-frame]))


(def sayings
  ["Der wheel zur macht"
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


(defn the-wheel-says
  []
  (sayings (int (rand (count sayings)))))


(defn wheel
  [])


(defn main-panel
  []
  (let [rotation (re-frame/subscribe [::subs/rotation])
        show-result (re-frame/subscribe [::subs/show-result])]
    [:div#wrapper
     [:h1#top-text "Hail the Wheel!"]
     [:div
      (when @show-result [:h1#result (if (even? (#(int (/ (mod (+ % 30) 1800) 60)) @rotation)) "NO!!!" "YES!!!")])
      [:div#wheel
       [:div#inner-wheel {:style {:transform (str "rotate(" @rotation "deg)")}}
        [:div#section1 [:span.yn-text.yes "YES"]]
        [:div#section2 [:span.yn-text.no "NO"]]
        [:div#section3 [:span.yn-text.yes "YES"]]
        [:div#section4 [:span.yn-text.no "NO"]]
        [:div#section5 [:span.yn-text.yes "YES"]]
        [:div#section6 [:span.yn-text.no "NO"]]]
       [:div#spin {:on-click #(re-frame.core/dispatch [:spin])}
        [:div#inner-spin]]]]
     [:h2 (if (= @rotation 0)
            [the-wheel-says]
            (str "The wheel says "))]]))
