(ns clojure-webapp.views.name
  (:use [hiccup core page]))

(defn name-view [name]
  (html5
    [:head
      [:title "Hello!"]]
    [:body
      [:h1 (str "Hello " name "!!")]]))
