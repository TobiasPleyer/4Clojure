;; Reverse Interleave - http://www.4clojure.com/problem/43
(fn [s n]
  (apply map vector (partition n n s)))
