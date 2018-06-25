;; This code works in my REPL, but the 4clojure sandbox does not accept it :(
;; Interleave Two Seqs - http://www.4clojure.com/problem/39
(fn [x y]
  (let [min-length (min (count x) (count y))
        xf (fn [rf]
             (fn
               ([] (rf))
               ([result] (rf result))
               ([result input] (rf (rf result (nth x input)) (nth y input)))))]
    (sequence xf (range min-length))))
