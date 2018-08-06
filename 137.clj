;; Digits and bases - http://www.4clojure.com/problem/137
(fn [n b]
  (if (zero? n)
    '(0)
    (loop [digits (list)
           n n]
      (if (zero? n)
        digits
        (recur (conj digits (mod n b)) (quot n b))))))
