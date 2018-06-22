;; Reverse a Sequence - http://www.4clojure.com/problem/23
(fn my-reverse [s-init]
  (let [s (seq s-init)
        length (count s)
        indices (range (dec length) -1 -1)]
    (map #(nth s %) indices)))
