(ns day1.app
  (:require [day1.input :refer [input]])
  (:require [clojure.string :as str]))

(defn day1 []
  (reduce + (map (fn [a] (int a)) (str/split input "\n"))))