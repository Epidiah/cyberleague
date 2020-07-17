(ns cyberleague.client.ui.styles
  (:require
    [garden.core :as garden])
  (:require-macros
    [garden.def :refer [defkeyframes]]))

(def blue "#3f51b5")
(def blue-dark "#1a237e")

(defkeyframes flash
  ["0%" {:background "default"}]
  ["45%" {:background blue-dark}]
  ["55%" {:background blue-dark}]
  ["100%" {:background "default"}])

(def styles
  [:body
   {:background "#eeeeee"
    :margin 0
    :padding 0
    :font-family "Inconsolata"
    :font-size "14px"}



   [:&:before
    {:content ""
     :display "block"
     :position "absolute"
     :top 0
     :left 0
     :height "180px"
     :width "100%"
     :background "#e0e0e0"}]

   [:a
    {:cursor "pointer"
     :color blue
     :text-decoration "none"}

    [:&:hover
     {:color blue-dark}]]

   [:#app
    {:position "absolute"
     :top 0
     :right 0
     :bottom 0
     :left 0
     :overflow-y "scroll"}

    [:.app
     {:width "100%"
      :height "100%"}

     [:.cards
      {:position "relative"
       :height "100%"
       :white-space "nowrap"
       :padding "60px 10px 20px 10px"
       :box-sizing "border-box"}]]]

   [:.app>header
    {:position "fixed"
     :top 0
     :height "2em"
     :width "100%"
     :box-sizing "border-box"
     :padding "20px"
     :z-index 1000}

    [:h1
     :h2
     {:display "inline-block"
      :vertical-align "middle"
      :height "2em"
      :line-height "2em"}]

    [:h1
     {:font-weight "bold"
      :margin-right "1em"}]

    [:nav
     {:position "absolute"
      :right "20px"
      :top "20px"
      :overflow "hidden"
      :height "2em"}

     [:a
      {:margin-right "1em"}]

     [:.log-out
      {:text-decoration "none"}]]

    [:.log-in
     {:display "inline-block"
      :padding "0.5em 0.75em"
      :border-radius "5px"
      :background blue
      :color "rgba(255,255,255,0.65)"
      :text-decoration "none"
      :vertical-align "middle"}

     [:&:hover
      {:color "white"}]

     [:&:before
      {:content ""
       :font-family "fontawesome"
       :margin-right "0.5em"}]]

    [:.user
     {:display "inline-block"
      :position "relative"
      :background blue
      :color "rgba(255,255,255,0.65)"
      :border-radius 5
      :padding-right "0.6em"
      :line-height "2em"
      :text-decoration "none"}

     [:&:hover
      {:color "white"}]

     [:img
      {:margin-top -1
       :margin-right "0.5em"
       :vertical-align "middle"
       :height "2em"
       :width "2em"
       :border-radius "5px"}]]]

   [:.card
    {:background "white"
     :width "300px"
     :height "100%"
     :margin "0 10px"
     :display "inline-block"
     :overflow "hidden"
     :box-sizing "border-box"
     :box-shadow "0 1px 1.5px 0 rgba(0,0,0,0.12)"
     :position "relative"
     :white-space "normal"}

    [:header
     {:background blue
      :position "relative"
      :color "white"
      :padding "1em"
      :animation [[flash "1s" "ease" "0s" "1" "normal"]]}

     [:span
      {:margin-right "1em"}]

     [:a
      {:color "rgba(255,255,255,0.65)"
       :margin-right "1em"
       :text-decoration "none"}

      [:&:hover
       {:color "white"}]]

     [:.close
      {:position "absolute"
       :top 0
       :right 0
       :text-decoration "none"
       :height "3em"
       :width "3em"
       :text-align "center"
       :line-height "3em"
       :margin 0}]

     [:.button
      {:position "absolute"
       :right "3em"
       :top 0
       :text-decoration "none"
       :margin "0.75em 0"
       :padding "0.25em 0.35em"
       :color blue
       :font-weight "bold"
       :background "rgba(255,255,255,0.65)"}

      [:&:hover
       {:color blue
        :background "white"}]]]

    [:.content
     {:padding "1em"
      :position "absolute"
      :top "3em"
      :bottom 0
      :left 0
      :right 0
      :overflow "scroll"
      :box-sizing "border-box"
      :line-height 1.15}

     [:p
      {:margin-bottom "1em"}]

     [:h2
      {:font-weight "bold"
       :margin-bottom "1em"}]

     [:table
      {:margin "0 auto"}

      [:th
       {:text-align "left"
        :font-weight "bold"
        :padding "0.25em"}]

      [:td
       {:padding "0.25em"
        :text-align "left"}]]]



    [:&.game
     {:width 400}]

    [:&.match

     [:h1
      {:text-align "center"
       :margin-bottom "1em"}]]

    [:&.match
     :&.code

     [:.results.goofspiel

      [:.td.winner
       {:font-weight 800
        :color "white"
        :background blue}]

      [:.hide
       {:display "none"}]]

     [:.results.tic-tac-toe

      [:td
       {:border "2px solid black"
        :padding "1em"}]

      [:tr:first-child

       [:td
        {:border-top "none"}]]

      [:tr:last-child

       [:td
        {:border-bottom "none"}]]

      [:tr

       [:td:first-child
        {:border-left "none"}]

       [:td:last-child
        {:border-right "none"}]]

      [:.subboard

       [:td
        {:border "1px solid grey"
         :padding "0.1em"}

        [:&.p1
         {:color "red"}]

        [:&.p2
         {:color blue}]]]]]

    [:&.code
     {:width 800}

     [:header

      [:.status
       {:position "absolute"
        :top 0
        :left "70%"
        :margin-left "1em"
        :line-height "3em"}

       [:.button
        {:position "static"
         :margin "0.5em 0"
         :line-height 1}]]]

     [:.content
      {:padding 0}

      [:.lang-pick
       :.source
       :.test
       {:display "inline-block"
        :vertical-align "top"
        :height "100%"
        :box-sizing "border-box"}]

      [:.source
       {:width "70%"}

       [:>div
        {:height "100%"}]]

      [:.lang-pick
       {:width "70%"
        :padding "1em"
        :line-height 1.5}

       [:h2
        {:margin-bottom 0}]

       [:a
        {:display "block"}]]

      [:.test
       {:width "30%"
        :background "#f7f7f7"
        :border-left "1px solid #ddd"}

       [:p
        {:margin "1em"
         :text-align "center"}]

       [:table
        {:width "100%"}

        [:th
         {:text-align "center"}]

        [:td
         {:text-align "center"}]]

       [:.log
        {:background "#ccc"
         :font-family "Inconsolata, monospace"
         :text-align "left"}]]]]]

   [:.button
    {:display "inline-block"
     :padding "0.5em 0.75em"
     :border-radius "5px"
     :background "#9fa8da"
     :color "white"
     :text-decoration "none"
     :vertical-align "middle"}

    [:&:hover
     {:background "#c5cae9"}]]

   [:.CodeMirror
    {:font-family "Inconsolata"
     :line-height 1.2
     :height "100%"
     :overflow "hidden"}]

   [:.CodeMirror-lines
    {:padding-top "1em"}]

   [:.clickable
    {:cursor "pointer"}]

   [:svg
    {:margin "0 -1em"}

    [:.axis
     [:path
      :line
      {:fill "none"
       :stroke "#ccc"
       :shape-rendering "crispEdges"}]]

    [:text
     {:fill "#ccc"
      :font-size "10px"}]

    [:.line
     {:stroke blue
      :fill "none"}]

    [:.area
     {:fill "#eee"}]]])

(def css
  (garden/css flash styles))