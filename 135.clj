;; Infix Calculator - http://www.4clojure.com/problem/135
(fn [& expressions]
  (loop [left (first expressions)
         exprs (rest expressions)]
    (if (empty? exprs)
      left
      (let [[op, right, &, more] exprs]
        (recur (op left right) more)))))