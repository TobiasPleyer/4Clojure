;; Pascal's Triangle - http://www.4clojure.com/problem/97
(fn pascal [n]
  (cond
    (= 1 n) [1]
    (= 2 n) [1 1]
    :else (loop [row [1 2 1]
                 i 3]
            (if (= n i)
              row
              (recur (conj (vec (cons 1 (map (partial apply +) (partition 2 1 row)))) 1) (inc i))))))