;; Perfect Numbers - http://www.4clojure.com/problem/80
(fn [n]
  (let [is-divisor? #(= 0 (rem n %))
        get-divisors (fn [n]
                       (let [N (int (Math/floor (Math/sqrt n)))
                             divisors (atom #{1})]
                         (doseq [d (range 2 (inc N))]
                           (when-not (contains? @divisors d)
                             (when (is-divisor? d)
                               (swap! divisors conj d)
                               (swap! divisors conj (/ n d)))))
                       @divisors))]
    (= n (apply + (get-divisors n)))))
