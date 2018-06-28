;; Pack a Sequence - http://www.4clojure.com/problem/31
(fn pack [s]
  (if (empty? s)
    []
    (lazy-seq
      (cons
       (take-while #(= (first s) %) s)
       (pack (drop-while #(= (first s) %) s))))))
