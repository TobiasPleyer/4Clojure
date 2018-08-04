;; Happy numbers - http://www.4clojure.com/problem/86
(fn [n]
  (let [digits (fn [n]
                 (map (comp
                        #(- % 48)
                        int)
                      (seq (str n))))
        square #(* % %)
        happy-sum (fn [n]
                    (->> n
                         digits
                         (map square)
                         (apply +)))
        seen (atom #{})]
    (loop [hs n]
      (cond
        (= 1 hs) true
        (contains? @seen hs) false
         :else (do
                 (swap! seen conj hs)
                 (recur (happy-sum hs)))))))
