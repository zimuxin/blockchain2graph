package com.oakinvest.b2g.repository.bitcoin;

import com.oakinvest.b2g.domain.bitcoin.BitcoinTransactionOutput;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * BitcoinTransactionOutput repository.
 * Created by straumat on 22/03/17.
 */
@Repository
public interface BitcoinTransactionOutputRepository extends GraphRepository<BitcoinTransactionOutput> {

}
