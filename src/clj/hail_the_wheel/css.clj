(ns hail-the-wheel.css
  (:require [garden.def :refer [defstyles]]))

(defstyles screen
  [:* {
       :box-sizing "border-box"
       :padding 0
       :margin 0
       :outline "none"
       }]
  [:body {:font-family "Open Sans"
          :display "flex"
          :justify-content "center"
          :align-items "center"
          :height "100vh"
          :overflow "hidden"
          }]
  [:.wheel-box {:position "relative"
               :width "500px"
               :height "500px"}]
  [:.wheel-box [:&:after {
                      :position "absolute"
                      :content ""
                      :background-color "red"
                      :width "32px"
                      :height "32px"
                      :right "-30px"
                      :top "50%"
                      :transform "translateY(-50%)"}]]
  [:.box {:width "100%"
          :height "100%"
          :position "relative"
          :border-radius "50%"
          :border "10px solid #ffffff"
          :overflow "hidden"
          :transition "all ease 5s"}]
  [:span {:width "50%"
          :height "50%"
          :display "inline-block"
          :position "absolute"}]
  [:.span1 {:clip-path "polygon(0 92%, 100% 50%, 0 8%)"
            :background-color "#ffeb3b"
            :top "120px"
            :left 0}]
  [:.span2 {:clip-path "polygon(100% 92%, 0 50%, 100% 8%)"
            :background-color "#e91e63"
            :top "120px"
            :right 0}]
  [:.span3 {:clip-path "polygon(50% 0%, 8% 100%, 92% 100%)"
            :background-color "#4caf50"
            :bottom 0
            :left "120px"}]
  [:.span4 {:clip-path "polygon(50% 100%, 92% 0, 8% 0)"
            :background-color "#3f51b5"
            :top 0
            :left "120px"}]
  [:.box2 {
           :width "100%"
           :height "100%"
           :transform "rotate(-135deg)"
           }]
  [:span [:b {
            :height "65px"
            :width "65px"
            :line-height "65px"
            :border-radius "50%"
            :font-size "26px"
            :text-align "center"
            :background-color "#fff"
            :position "absolute"
            :top "50%"
            :left "50%"
            :transform "translate(-50%,-50%)"
            :box-shadow "inset 0 3px 3px 0 #717171"
            }]]
  [:.spin-button {
            :position "absolute"
            :top "50%"
            :left "50%"
            :transform "translate(-50%,-50%)"
            :height "75px"
            :width "75px"
            :border-radius "50%"
            :border "4px solid #fff"
            :background-color "#ff5722"
            :font-size "22px"
            :font-weight "bold"
                  :cursor "pointer"
            :text-align "center"
            :box-shadow "0 5px 20px #000"
                 }]
  [:.spin-button [:&:active {
                  :width "70px"
                  :height "70px"
                  :font-size "21px"}]])
