(ns clojure-webapp.views.index
  (:use [hiccup core page]))

(defn index-view []
  (html5
    [:head
      [:title "Hello World"]]
    [:body
      [:h1 "Hello world!!"]]))
