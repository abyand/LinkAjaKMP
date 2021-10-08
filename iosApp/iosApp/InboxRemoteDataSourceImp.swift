//
//  InboxRemoteDataSourceImp.swift
//  iosApp
//
//  Created by Abyan Dafa on 07/10/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import Foundation
import pepes

final class InboxRemoteDataSOurceImp: InboxRemoteDataSource {
    func fetchCategoryInbox(msisdn: String, language: Language, completionHandler: @escaping (RequestCategoryInboxStatus?, Error?) -> Void) {
        let model = RequestCategoryInboxStatus.SuccessLocal(data: [])
        completionHandler(model, nil)
    }
    
    
    
}
