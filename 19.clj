;; Last Element - http://www.4clojure.com/problem/19
(fn [s-init]
  (loop [s s-init]
    (if (next s)
      (recur (next s))
      (first s))))
