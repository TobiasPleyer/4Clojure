;; Sum of square of digits - http://www.4clojure.com/problem/120
(fn [s]
  (let [square (fn [s] (reduce #(+ %1 (* %2 %2)) 0 s))
        get-digits (fn helper [n]
                     (if (< n 10)
                       (list n)
                       (lazy-seq (cons (rem n 10) (helper (quot n 10))))))]
    (->> s
         (map #(vector % (square (get-digits %))))
         (filter #(< (first %) (second %)))
         count)))