;; A Half-Truth - http://www.4clojure.com/problem/83
(fn half-truth [& bools]
  (and (boolean (some true? bools)) (boolean (not-every? true? bools))))
