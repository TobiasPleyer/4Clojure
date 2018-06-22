;; Nth Element - http://www.4clojure.com/problem/21
(fn [s-init n-init]
  (loop [s s-init
         n n-init]
    (if (= 0 n)
      (first s)
      (recur (rest s) (dec n)))))
