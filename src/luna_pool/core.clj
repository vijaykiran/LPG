(ns luna-pool.core
  (:use [compojure.core :only (defroutes)])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.adapter.jetty :as ring]
            [luna-pool.controllers.gamers :as gamers]))

;;; define the routes
(defroutes routes
  gamers/routes
  (route/resources "/"))

;;; the main application
(def application (handler/site routes))

;;; start function to start the jetty server on 'port'
(defn start [port]
  (ring/run-jetty (var application) {:port (or port 8080) :join? false }))

(defn -main []
  (let [port (Integer/parseInt (System/getenv "PORT"))]
    (start port)))
