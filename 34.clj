;; Implement range - http://www.4clojure.com/problem/34
(fn my-range [start stop]
  (take (- stop start) (iterate inc start)))
