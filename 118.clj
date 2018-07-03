;; Re-implement Map - http://www.4clojure.com/problem/118
(fn my-map [f s]
  (if (empty? s)
    []
    (lazy-seq (cons (f (first s)) (my-map f (rest s))))))