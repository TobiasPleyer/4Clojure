;; Power Set - http://www.4clojure.com/problem/85
(fn power-set [s]
  (let [cnt (count s)
        subsets (fn [s] (set (map #(disj s %) (seq s))))
        next-level (fn [ss] (apply clojure.set/union (map subsets ss)))]
    (apply clojure.set/union (take (inc cnt) (iterate next-level #{s})))))
