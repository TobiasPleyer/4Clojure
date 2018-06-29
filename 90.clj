;; Cartesian Product - http://www.4clojure.com/problem/90
(fn cartesian [s1 s2]
  (set (for [e1 s1
             e2 s2]
         [e1 e2])))
