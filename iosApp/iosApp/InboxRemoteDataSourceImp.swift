//
//  InboxRemoteDataSourceImp.swift
//  iosApp
//
//  Created by Abyan Dafa on 07/10/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import Foundation
import pepes

final class InboxRemoteDataSOurceImp: InboxRepository {
    func clearInboxCollection(completionHandler: @escaping (KotlinUnit?, Error?) -> Void) {
        <#code#>
    }
    
    func parseInbox(param: String) -> Inbox {
        <#code#>
    }
    
    func requestCategoryInbox(msisdn: String, language: Language, completionHandler: @escaping (Kotlinx_coroutines_coreFlow?, Error?) -> Void) {
        <#code#>
    }
    
    func requestListInbox(msisdn: String, idCategory: Int32, page: Int32, limit: Int32, completionHandler: @escaping (Kotlinx_coroutines_coreFlow?, Error?) -> Void) {
        <#code#>
    }
    
    func requestMarkReadAllInbox(msisdn: String, param: Int32, completionHandler: @escaping (KotlinUnit?, Error?) -> Void) {
        <#code#>
    }
    
    func requestMarkReadInbox(inbox: Inbox, completionHandler: @escaping (KotlinUnit?, Error?) -> Void) {
        <#code#>
    }
    
    
}
