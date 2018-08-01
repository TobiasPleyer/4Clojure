;; Sequence Reductions - http://www.4clojure.com/problem/60
(fn my-reductions
  ([f s0 s]
    (lazy-seq (cons s0 (if (empty? s) [] (my-reductions f (f s0 (first s)) (rest s))))))
  ([f s]
    (if (empty? s)
       []
       (my-reductions f (first s) (rest s)))))
