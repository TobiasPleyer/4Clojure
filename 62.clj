;; Re-implement Iterate - http://www.4clojure.com/problem/62
(fn my-iterate [f x]
  (lazy-seq
    (cons x (my-iterate f (f x)))))
