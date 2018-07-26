;; Partition a Sequence - http://www.4clojure.com/problem/54
(fn f [x s]
  (cond
    (empty? s) '()
    (> x (count s)) '()
  	:else (lazy-seq
            (cons (take x s) (f x (drop x s))))))
