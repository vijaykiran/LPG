(ns lpg.controllers.gamers
  (:use [compojure.core :only [defroutes GET POST PUT DELETE]]))

(defn index
  "Get list of gamers"
  ([]
     (println "GET the list of Gamers")

     )
  ([id] (println "GET the gamer with " id)))

(defn create
  "Create a gamer using the specificed email and gamertag"
  [params]
  (println "Creating a new gamer" params))

(defn update
  "Update the gamer details email etc."
  [params]
  (println "Updating the gamer" params))

(defroutes routes
  (GET  "/gamers" [] (index))
  (GET  "/gamers/:id" [id]  (index id) )
  (PUT  "/gamers/" {params :params} (update params))
  (POST "/gamers/" {params :params} (create params)))
