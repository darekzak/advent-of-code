(ns aocapp
  (:require [day1.app :refer [day1]])
  (:require [day2.app :refer [day2]]))

(defn mainapp []
  (println "Advent of code 2018")
  (println "day1: " (day1))
  (println "day2: " (day2)))
