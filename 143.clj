;; dot product - http://www.4clojure.com/problem/143
(fn [v1 v2]
  (reduce #(+ %1 (apply * %2)) 0 (map vector v1 v2)))