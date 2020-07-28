(ns hail-the-wheel.css
  (:require
    [garden.def :refer [defstyles defkeyframes]]))

(def red "#f98ca4")
(def blue "#4ad9db")
(def green "#65f283")
(def orange "#f5b10b")
(def darkblue "#2f3e9c")
(def darkred "#9e132c")
(def purple "#6e1f58")
(def pink "#c0faca")
(def outline "2px")


(defkeyframes my-animation
  [:0% :100%
   {:transform "rotate(0deg)"}]
  [:50%
   {:transform "rotate(7deg)"}])

(defkeyframes floating
  [:from { :transform "translate(0, 0px)" }]
  [:65% { :transform "translate(0, 15px)" }]
  [:to { :transform "translate(0, -0px)" }])

(defstyles screen
  [:* {:padding 0
       :margin 0}]
  [:html :body
   {:width "100%"
    :height "100%"
    :background "linear-gradient(10deg, rgba(244,235,160,1) 73%,rgba(192,250,202,1) 73%)"
    :body "#fff"
    :font-family "sans-serif"
    :font-size "18px"}]

  [:h1 :h2 {:text-align "center"
            :line-height 1
            :text-transform "uppercase"
            :text-shadow (str "-1px -1px 0 " purple ", 1px -1px 0 " purple ", -1px 1px 0 " purple ", 1px 1px 0 " purple ", 1px 0px 0px " green ", 0px 1px 0px " green ", 2px 1px 0px " green ", 1px 2px 0px " green ", 3px 2px 0px " green ", 2px 3px 0px " green ", 4px 3px 0px " green ", 3px 4px 0px " green ", 5px 4px 0px " green ", 3px 5px 0px " purple ", 6px 5px 0px " purple ", -1px 2px 0 black, 0 3px 0 " purple ", 1px 4px 0 " purple ", 2px 5px 0px " purple ", 2px -1px 0 " purple ", 3px 0 0 " purple ", 4px 1px 0 " purple ", 5px 2px 0px " purple ", 5px 2px 0 " purple ", 6px 3px 0 " purple ", 8px 8px 4px #dac249"
                              )}]

  [:h1 {:font-size "38pt"
        :color blue}]

  [:#result {:font-size "72pt"
             :position "absolute"
             :color "#65f283"
             :top "250px"
             :right "-35px"
             :z-index 10
             :text-shadow (str "-1px -1px 0 " purple ", 1px -1px 0 " purple ", -1px 1px 0 " purple ", 1px 1px 0 " purple ", 1px 0px 0px " green ", 0px 1px 0px " green ", 2px 1px 0px " green ", 1px 2px 0px " green ", 3px 2px 0px " green ", 2px 3px 0px " green ", 4px 3px 0px " green ", 3px 4px 0px " green ", 5px 4px 0px " green ", 3px 5px 0px " purple ", 6px 5px 0px " purple ", -1px 2px 0 black, 0 3px 0 " purple ", 1px 4px 0 " purple ", 2px 5px 0px " purple ", 2px -1px 0 " purple ", 3px 0 0 " purple ", 4px 1px 0 " purple ", 5px 2px 0px " purple ", 5px 2px 0 " purple ", 6px 3px 0 " purple ", 8px 8px 4px rgba(0,0,0,0.3)")
             :animation-name "floating"
             :animation-duration "3s"
             :animation-iteration-count "infinite"
             :animation-timing-function "ease-in-out" }]

  [:#result:focus {:display "none"}]


  [:h2 {:font-size "22pt"
        :color pink}]

  [:#wrapper {:margin "40px auto 0"
              :width "266px"
              :position "relative"}]

  [:#wheel {:position "relative"
            :width "250px"
            :height "250px"
            :overflow "hidden"
            :border "8px solid #fff"
            :box-shadow (str "-1px -1px 0 " purple ", 1px -1px 0 " purple ", -1px 1px 0 " purple ", 1px 1px 0 " purple ", 1px 0px 0px " green ", 0px 1px 0px " green ", 2px 1px 0px " green ", 1px 2px 0px " green ", 3px 2px 0px " green ", 2px 3px 0px " green ", 4px 3px 0px " green ", 3px 4px 0px " green ", 5px 4px 0px " green ", 3px 5px 0px " purple ", 6px 5px 0px " purple ", -1px 2px 0 black, 0 3px 0 " purple ", 1px 4px 0 " purple ", 2px 5px 0px " purple ", 2px -1px 0 " purple ", 3px 0 0 " purple ", 4px 1px 0 " purple ", 5px 2px 0px " purple ", 5px 2px 0 " purple ", 6px 3px 0 " purple ", 8px 8px 4px #dac249")
            :transform "rotate(0deg)"
            :margin-top "1em"
            :margin-bottom "1em"
            :border-radius "50%"}]

  [:#wheel:before {:content "\"\""
                   :position "absolute"
                   :border "4px solid rgba(0,0,0,0.1)"
                   :width "242px"
                   :height "242px"
                   :border-radius "50%"
                   :z-index 1000}]

  [:#inner-wheel {:width "100%"
                  :height "100%"
                  :transition "all 6s cubic-bezier(0,.99,.44,.99)"}]

  [:#section1
   :#section2
   :#section3
   :#section4
   :#section5
   :#section6
   :#section7
   :#section8
   {:position "absolute"
    :width "0"
    :height "0"
    :border-style "solid"
    :border-width "130px 75px 0"
    :border-color "#19c transparent"
    :transform-origin "75px 129px"
    :left "50px"
    :top "-4px"
    :opacity 1}]

  [:#wheel [:#section1 {:transform "rotate(60deg)"
                        :border-color "#16a085 transparent"}]]
  [:#wheel [:#section2 {:transform "rotate(120deg)"
                        :border-color "#2980b9 transparent"}]]
  [:#wheel [:#section3 {:transform "rotate(180deg)"
                        :border-color "#34495e transparent"}]]
  [:#wheel [:#section4 {:transform "rotate(240deg)"
                        :border-color "#f39c12 transparent"}]]
  [:#wheel [:#section5 {:transform "rotate(300deg)"
                        :border-color "#d35400 transparent"}]]
  [:#wheel [:#section6 {:transform "rotate(360deg)"
                        :border-color "#c0392b transparent"}]]

  [:#wheel [:div [:.yn-text {:margin-top "-100px"
                             :color "white"
                             :position "relative"
                             :z-index 100000
                             :display "block"
                             :text-align "center"
                             :font-size "24px"
                             :border-color "black"
                             :border-width "1px"
                             :text-shadow "rgba(255, 255, 255, 0.1) 0px -1px 0px, rgba(0, 0, 0, 0.2) 0px 1px 0px"}]]]
  [:#wheel [:div [:.yes {:margin-left "-24px"}]]]
  [:#wheel [:div [:.no {:margin-left "-19px"}]]]

  [:#spin {:width "68px"
           :height "68px"
           :position "absolute"
           :top "50%"
           :left "50%"
           :margin "-34px 0 0 -34px"
           :border-radius "50%"
           :z-index "1000"
           :background "#fff"
           :cursor "pointer"
           :font-family "sans-serif"
           :box-shadow (str "-1px -1px 0 " purple ", 1px -1px 0 " purple ", -1px 1px 0 " purple ", 1px 1px 0 " purple ", 1px 0px 0px " green ", 0px 1px 0px " green ", 2px 1px 0px " green ", 1px 2px 0px " green ", 3px 2px 0px " green ", 2px 3px 0px " green ", 4px 3px 0px " green ", 3px 4px 0px " green ", 5px 4px 0px " green ", 3px 5px 0px " purple ", 6px 5px 0px " purple ", -1px 2px 0 black, 0 3px 0 " purple ", 1px 4px 0 " purple ", 2px 5px 0px " purple ", 2px -1px 0 " purple ", 3px 0 0 " purple ", 4px 1px 0 " purple ", 5px 2px 0px " purple ", 5px 2px 0 " purple ", 6px 3px 0 " purple)
           :user-select "none"}]

  [:#spin:after {:content "\"SPIN\""
                 :text-align "center"
                 :line-height "68px"
                 :color "#CCC"
                 :text-shadow "0 2px 0 #fff, 0 -1px 0 rgba(0,0,0,0.3)"
                 :position "relative"
                 :z-index 100000
                 :width "68px"
                 :height "68px"
                 :display "block"}]
  [:#spin:before {:content "\"\""
                  :position "absolute"
                  :width 0
                  :height 0
                  :border-style "solid"
                  :border-width "0 20px 28px 20px"
                  :border-color "transparent transparent #ffffff transparent"
                  :top "-12px"
                  :left "14px"}]

  [:#inner-spin {:width "54px"
                 :height "54px"
                 :position "absolute"
                 :top "50%"
                 :left "50%"
                 :margin "-27px 0 0 -27px"
                 :border-radius "50%"
                 :z-index "999"
                 :box-shadow "rgba(255,255,255,1) 0px -2px 0px inset, rgba(255,255,255,1) 0px 2px 0px inset,  rgba(0,0,0,0.4) 0px 0px 5px"
                 :background "-webkit-radial-gradient(center, ellipse cover,  rgba(255,255,255,1) 0%,rgba(234,234,234,1) 100%)"}]

  [:#spin:active [:#inner-spin {:box-shadow "rgba(0,0,0,0.4) 0px 0px 5px inset"}]]

  [:#spin:active:after {:font-size "15px"}]

  [my-animation
   [:.spin
    {:animation [[my-animation "0.1s"]]}]]

  [floating
   [:#result]])
