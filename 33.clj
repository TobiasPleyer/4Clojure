;; Replicate a Sequence - http://www.4clojure.com/problem/33
(fn [s n]
  (if (< n 2)
    s
    (apply interleave (take n (repeat s)))))
