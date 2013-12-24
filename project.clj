(defproject clojure-webapp "0.1.0-SNAPSHOT"
  :description "A simple clojure webapp for me to get acclimated with clojure."
  :url "https://github.com/farmdawgnation/clojure-webapp"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [lib-noir "0.7.8"]
                 [hiccup "1.0.4"]]
  :plugins [[lein-ring "0.8.8"]]
  :ring {:handler clojure-webapp.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
