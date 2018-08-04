;; Euler's Totient Function - http://www.4clojure.com/problem/75
(fn [n]
  (if (= 1 n)
    1
    (let [gcd (fn [x y]
                (let [smaller (min x y)
                      bigger (max x y)]
                  (loop [b bigger
                         s smaller]
                    (let [r (mod b s)]
                      (if (= 0 r)
                      s
                      (recur s r))))))
          is-coprime? (fn [x] (= 1 (gcd n x)))]
      (count (filter is-coprime? (range 1 n))))))
