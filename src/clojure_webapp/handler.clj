(ns clojure-webapp.handler
  (:use compojure.core
        clojure-webapp.views.index
        clojure-webapp.views.name)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [noir.response :as noirresponse]
            [clojure.string :as string]))

(defroutes app-routes
  (GET "/" [] (index-view))
  (GET "/hello/:name" [name]
    (let [proper-name (string/capitalize name)
          full-name (str "Mr. " proper-name)]
      (name-view full-name)))
  (GET "/json" [] (noirresponse/json {:bacon "is awesome" :willy "is wonka" :sauce 2}))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
