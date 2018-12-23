(ns day2.app
  (:require [day2.input :refer [input]])
  (:require [clojure.string :as str]))

(defn day2 []
  (->> (str/split input "\n")
       (map (fn [x] (vals (frequencies x))))
       (reduce
        (fn [[x y] s] s
          [(if (some #{2} s) (inc x) x), (if (some #{3} s) (inc y) y)])
        [])
       ((fn [[x y]] (* x y)))))