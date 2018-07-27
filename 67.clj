;; Prime Numbers - http://www.4clojure.com/problem/67
(fn [n]
  (let [found-primes (atom [])
        new-prime? (fn [n]
                    (true? (not-any? #(= 0 %) (map #(mod n %) @found-primes))))
        primes (fn ps
                 ([] (ps 2))
                 ([n]
                   (if (new-prime? n)
                     (do
                       (swap! found-primes conj n)
                       (lazy-seq (cons n (ps (inc n)))))
                     (ps (inc n)))))]
    (take n (primes))))
