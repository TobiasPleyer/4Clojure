;; Decurry - http://www.4clojure.com/problem/158
(fn [f]
  (fn [& args]
    (reduce (fn [f x] (f x)) (cons f args))))
