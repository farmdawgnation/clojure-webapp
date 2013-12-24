(ns clojure-webapp.handler
  (:use compojure.core
        clojure-webapp.views.index)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [noir.response :as noirresponse]))

(defroutes app-routes
  (GET "/" [] (index-view))
  (GET "/hello/:name" [name] (str "Hello " name))
  (GET "/json" [] (noirresponse/json {:bacon "is awesome" :willy "is wonka" :sauce 2}))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
