;; Greatest Common Divisor - http://www.4clojure.com/problem/66
(fn [x y]
  (let [smaller (min x y)
        bigger (max x y)]
    (loop [b bigger
           s smaller]
      (let [r (mod b s)]
        (if (= 0 r)
          s
          (recur s r))))))
