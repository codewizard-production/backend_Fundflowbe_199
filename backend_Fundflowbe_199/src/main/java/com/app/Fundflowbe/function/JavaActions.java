package com.app.Fundflowbe.function;

import com.app.Fundflowbe.model.Stage;
import com.app.Fundflowbe.model.Startup;
import com.app.Fundflowbe.model.FundingRound;
import com.app.Fundflowbe.model.Founder;
import com.app.Fundflowbe.model.Document;
import com.app.Fundflowbe.model.Investor;




import com.app.Fundflowbe.enums.RoundStatus;
import com.app.Fundflowbe.enums.StageName;
import com.app.Fundflowbe.converter.StageNameConverter;
import com.app.Fundflowbe.converter.RoundStatusConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  