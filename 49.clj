;; Split a sequence - http://www.4clojure.com/problem/49
(fn [n s]
  (cons (take n s) (cons (drop n s) [])))