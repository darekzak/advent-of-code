(ns day1.app
  (:require [day1.input :refer [input]])
  (:require [clojure.string :as str]))

(def day1
  (reduce + (map (fn [a] (int a)) (str/split input "\n"))))

(defn init []
  (println "Hello world - advent of code: Day1 result: " day1))

(defn reload []
  (println "reload " day1))

; (defn getOperator [s]
;   (subs s 0 1))

; (str/split input "\n")
; (map (fn [a] (subs a 1)) (get (group-by getOperator (str/split input "\n")) "+"))

