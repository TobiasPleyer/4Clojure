;; Least Common Multiple - http://www.4clojure.com/problem/100
(fn lcm [& numbers]
  (let [gcd (fn [x y]
              (let [smaller (min x y)
                    bigger (max x y)]
                (loop [b bigger
                       s smaller]
                  (let [r (mod b s)]
                    (if (= 0 r)
                    s
                    (recur s r))))))
        cnt (count numbers)]
    (loop [a (first numbers)
           s (rest numbers)]
      (if (empty? s)
        a
        (recur (/ (* a (first s)) (gcd a (first s))) (rest s))))))