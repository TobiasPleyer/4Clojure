;; Duplicate a Sequence - http://www.4clojure.com/problem/32
(fn double-up [s]
  (if (empty? s)
    '()
    (let [fst (first s)
          rst (rest s)]
      (cons fst (cons fst (double-up rst))))))
